//21700305 박지성
enum CH06b_Suit {
    MON("red"), TUE("orange"), WED("yellow"), THU("green"), FRI("blue"), SAT("indigo"), SUN("purple");

    private final String color;
    private CH06b_Suit(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
