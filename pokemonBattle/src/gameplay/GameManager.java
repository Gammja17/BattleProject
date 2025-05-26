package gameplay;

import pokemon.*;
import skill.*;

public class GameManager {
	
	Wild[] wildPool = new Wild[5];
	
	Skill 몸통박치기 = new 위력기("몸통박치기", Type.노말, 30, 95);
	Skill 할퀴기 = new 위력기("할퀴기", Type.노말, 20, 100);
	Skill 덩굴채찍 = new 위력기("덩굴채찍", Type.풀, 40, 100);
	Skill 불꽃세례 = new 위력기("불꽃세례", Type.불, 40, 100);
	Skill 물대포 = new 위력기("물대포", Type.물, 40, 100);
	Skill 솔라빔 = new 위력기("솔라빔", Type.풀, 100, 85);
	Skill 화염방사 = new 위력기("화염방사", Type.불, 90, 100);
	Skill 하이드로펌프 = new 위력기("하이드로펌프", Type.물, 120, 70);
	Skill 마구할퀴기 = new 위력기("마구할퀴기", Type.노말, 60, 100);
	Skill 용성군 = new 위력기("용성군", Type.노말, 130, 90);
	
	Skill 고속이동 = new 특수기("고속이동", Type.노말, 0, 100); 
	Skill 칼춤 = new 특수기("칼춤", Type.노말, 0, 100);       
	Skill 방어 = new 특수기("방어", Type.노말, 0, 100); 
	
	
	
	public Starting selectStarting(int select) {
		Starting 디폴트 = new Starting("이상해씨", 110, 20, 40, 20, Type.풀);
		switch(select) {
		case 1 : //이상해씨
			Starting 이상해씨 = new Starting("이상해씨", 110, 20, 40, 20, Type.풀);
			 이상해씨.setSkill(0, 몸통박치기);
			 return 이상해씨;
		case 2 : //파이리
			Starting 파이리 = new Starting("파이리", 90, 40, 20, 30, Type.불);
			파이리.setSkill(0, 할퀴기);
			return 파이리;
		case 3 : //꼬부기
			Starting 꼬부기 = new Starting("꼬부기", 100, 30, 30, 25, Type.물);
			꼬부기.setSkill(0, 몸통박치기);
			return 꼬부기;
		}
		return 디폴트;
	}

	public Wild createWild(int number) {
    Wild wild = null;

    switch (number) {
        case 1:
            wild = new Wild("꼬렛", 70, 20, 20, 30, Type.노말, 2);
            wild.setSkill(0, 몸통박치기);
            wild.setSkill(1, 할퀴기);
            break;

        case 2:
            wild = new Wild("모다피", 70, 25, 25, 25, Type.풀, 4);
            wild.setSkill(0, 몸통박치기);
            wild.setSkill(1, 덩굴채찍);
            break;

        case 3:
            wild = new Wild("가디", 90, 25, 25, 27, Type.불, 5);
            wild.setSkill(0, 몸통박치기);
            wild.setSkill(1, 불꽃세례);
            break;

        case 4:
            wild = new Wild("크랩", 80, 30, 20, 30, Type.물, 6);
            wild.setSkill(0, 몸통박치기);
            wild.setSkill(1, 물대포);
            break;

        case 5:
            wild = new Wild("나옹", 80, 40, 15, 25, Type.노말, 10);
            wild.setSkill(0, 할퀴기);
            wild.setSkill(1, 마구할퀴기);
            break;

        case 6:
            wild = new Wild("페르시온", 130, 50, 25, 60, Type.노말, 15);
            wild.setSkill(0, 칼춤);
            wild.setSkill(1, 마구할퀴기);
            break;

        case 7:
            wild = new Wild("레쿠쟈", 200, 100, 60, 80, Type.노말, 20);
            wild.setSkill(0, 용성군);
            wild.setSkill(1, 화염방사);
            wild.setSkill(2, 하이드로펌프);
            wild.setSkill(3, 솔라빔);
            break;

        default:
            System.out.println("잘못된 포켓몬 번호입니다.");
            break;
    }

    return wild;
}



	
	
}
