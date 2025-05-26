package gameplay;

import pokemon.*;
import skill.*;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        GameManager gm = new GameManager();
        
        System.out.println("게임을 시작합니다");
        System.out.println("당신의 이름은 무엇인가요?: ");
        
        Player player = new Player();
        player.name = sc.nextLine();
        
        System.out.println(player.name+"! 포켓몬의 세계에 잘 왔다. 너의 첫 포켓몬을 골라보렴...");
        System.out.println("1.이상해씨 2.파이리 3.꼬부기");
        
        int select = sc.nextInt();
        player.myPkm = gm.selectStarting(select);
        System.out.println(player.myPkm.name+"이구나. 좋은 포켓몬이지!");
        System.out.println("전설의 포켓몬 레쿠쟈가 폭주하고 있어... 네가 막아주었으면 좋겠구나.");
        System.out.println("앞으로의 여정이 찬란하기를!");
        
        int wave = 1;
        
        while(wave<=10) {
        	
        	switch(wave) {
            case 1, 2, 3, 4, 6, 7, 8, 9:
            System.out.println(wave + "Wave");
            System.out.println("무슨 행동을 할까?");
            while(true) {
	            System.out.println("1. 앞으로 나아간다 / 2. 포켓몬 상태 확인");
	            if(sc.nextInt()==1) {
	            	int num = new Random().nextInt(5) + 1; // 1~5 중 랜덤 (보스 제외)
	            	Wild enemy = gm.createWild(num);
	            	System.out.println("앞으로 나아갑니다.");
	            	System.out.println("야생의 " + enemy.name + "이(가) 나타났다!");
	            	battle(player.myPkm, enemy);
	            }
	            if(sc.nextInt()==2) {
	            	System.out.println(player.myPkm.name+"의 현재 체력은 "+player.myPkm.hp+"입니다.");
	            }
            }
            }
        }   
    }
    

}
