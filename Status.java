enum Stat{
    Offline,
    Online,
    Terminated;
}

class Status{
    public static void main(String[] args) {

        Stat s = Stat.Online;
        System.out.println(s);
    }
}