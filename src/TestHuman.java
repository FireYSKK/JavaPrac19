public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();
        human.setHairStyle("Short", "blonde");
        System.out.println(human.getHairStyle());
        human.walk();
        human.decline();
        human.grab('R', "bench");
        human.lift('R', "bench");
        human.agree();
        //Human strong
    }
}
