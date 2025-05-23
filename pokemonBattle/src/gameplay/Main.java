package gameplay;

import pokemon.*;
import skill.*;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        파이리 p1 = new 파이리(3);
        p1.name = "내 파이리";

        파이리 p2 = new 파이리(3);
        p2.name = "상대 파이리";

        System.out.println(p1.name + "과 " + p2.name + "의 배틀 시작!");

        while (p1.hp > 0 && p2.hp > 0) {
            Pokemon first = (p1.spd >= p2.spd) ? p1 : p2;
            Pokemon second = (first == p1) ? p2 : p1;

            // 각 턴 (2번)
            for (int i = 0; i < 2; i++) {
                Pokemon attacker = (i == 0) ? first : second;
                Pokemon defender = (i == 0) ? second : first;

                if (attacker.hp <= 0) continue; // 쓰러지면 스킵

                Skill chosenSkill = null;

                if (attacker == p1) {
                    System.out.println("\n[" + attacker.name + "]의 턴입니다.");
                    System.out.println("사용할 기술을 선택하세요:");
                    for (int j = 0; j < attacker.skill.length; j++) {
                        if (attacker.skill[j] != null) {
                            System.out.println(j + " : " + attacker.skill[j].name + " (위력: " + attacker.skill[j].dmg + ", 명중률: " + attacker.skill[j].hittingRate + ")");
                        }
                    }

                    int choice;
                    while (true) {
                        System.out.print(">> ");
                        choice = sc.nextInt();
                        if (choice >= 0 && choice < attacker.skill.length && attacker.skill[choice] != null) break;
                        System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                    }

                    chosenSkill = attacker.skill[choice];
                } else {
                    // 상대방은 랜덤 기술 선택
                    List<Skill> available = new ArrayList<>();
                    for (Skill s : attacker.skill) {
                        if (s != null) available.add(s);
                    }
                    chosenSkill = available.get(rand.nextInt(available.size()));
                    System.out.println("\n[" + attacker.name + "]의 턴! → " + chosenSkill.name + " 사용!");
                }

                BattleManager.useSkill(attacker, defender, chosenSkill);

                if (defender.hp <= 0) {
                    System.out.println(defender.name + "이(가) 쓰러졌습니다!");
                    break;
                }
            }
        }

        System.out.println("\n===== 배틀 종료 =====");
        System.out.println((p1.hp > 0 ? p1.name : p2.name) + "의 승리!");
        sc.close();
    }
}
