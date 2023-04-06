package ch06.gameCharacter;

public class GameCharacterTest {
    public static void main(String[] args) {
        GameCharacter gcc = new GameCharacter();
        gcc.add("Sword", 1, 100);
        gcc.add("gun", 2, 50);
        gcc.print();
    }
}
