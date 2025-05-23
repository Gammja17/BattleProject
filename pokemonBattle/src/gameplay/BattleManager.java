package gameplay;


import pokemon.Pokemon;
import skill.Skill;
import java.util.Random;

public class BattleManager {
    private static final Random rand = new Random();

    public static void useSkill(Pokemon me, Pokemon you, Skill skill) {
        System.out.println(attacker.name + "이(가) " + skill.name + "을(를) 사용합니다!");

        // 명중 여부 확인
        int chance = rand.nextInt(100) + 1; // 1~100
        if (chance > skill.hittingRate) {
            System.out.println("하지만 빗나갔다!");
            return;
        }

        // 데미지 계산
        int baseDamage;
        if (skill.skillForm == 1) { // 물리
            baseDamage = skill.dmg + attacker.atk - defender.def;
        } else { // 특수
            baseDamage = skill.dmg + attacker.spAtk - defender.spDef;
        }

        if (baseDamage < 1) baseDamage = 1; // 최소 데미지 보장

        // 자속 보정 (STAB)
        if (attacker.type == skill.type) {
            baseDamage *= 1.2;
        }

        // 상성 보정
        double affinity = typeEffect(skill.type, defender.type);
        baseDamage *= affinity;

        // 급소 판정
        if (rand.nextInt(100) < 5) {  // 5% 확률
            System.out.println("급소에 맞았다!");
            baseDamage *= 2;
        }

        // 데미지 적용
        defender.hp -= baseDamage;
        System.out.println(defender.name + "에게 " + baseDamage + "의 데미지!");
        if (defender.hp <= 0) {
            defender.hp = 0;
            System.out.println(defender.name + "은(는) 쓰러졌다!");
        }
    }

    // 타입 상성 계산
    private static double typeEffect(int skillType, int targetType) {
        if (skillType == 2 && targetType == 4) return 2.0;   // 풀 > 물
        if (skillType == 4 && targetType == 3) return 2.0;   // 물 > 불
        if (skillType == 3 && targetType == 2) return 2.0;   // 불 > 풀
        if (skillType == 4 && targetType == 2) return 0.5;   // 물 < 풀
        if (skillType == 2 && targetType == 3) return 0.5;   // 풀 < 불
        if (skillType == 3 && targetType == 4) return 0.5;   // 불 < 물
        return 1.0;  // 그 외 (노말 등)
    }
}

