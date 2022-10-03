class phone{
    public void phoneDetails() {
        System.out.println("Phone Details");
    }
}

class sam extends phone{
    public void phoneDetails2() {
        System.out.println("Samsung Details");
    }
}

class page1 {
    public static void main(String[] args) {
        sam p1 = new phone();
        p1.phoneDetails2();
    }
}