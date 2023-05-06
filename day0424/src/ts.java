public class ts {
    public static void main(String[] args) {
        Team t = new Team();
        System.out.println(t.attackSum());
    }
}
class Role{
    String name;
    public int attack() {

        return 0;
    }
    static class Magic extends Role{
        int magiclevel = 1;
        int magichurt = 5;
        @Override
        public int attack() {
            int hurt1;
            hurt1 = magiclevel*magichurt;
            return hurt1;
        }

        public int getMagiclevel() {
            return magiclevel;
        }

        public int getMagichurt() {
            return magichurt;
        }

        public void setMagiclevel(int magiclevel) {
            this.magiclevel = magiclevel;
        }

        public void setMagichurt(int magichurt) {
            this.magichurt = magichurt;
        }
    }
    static class Soldier extends Role{
        int hurtlevel = 1;
        @Override
        public int attack() {
            int hurt2;
            hurt2 = hurtlevel;
            return hurt2;
        }

        public int getHurtlevel() {
            return hurtlevel;
        }

        public void setHurtlevel(int hurtlevel) {
            this.hurtlevel = hurtlevel;
        }
    }
}
class Team{
    public int attackSum(){
        Role role;
        Role.Magic m = new Role.Magic();
        Role.Soldier s = new Role.Soldier();
        int allhurt;
        allhurt = m.attack()+s.attack();
        return allhurt;
    }
    public void addMember(Role role){
        int [] num = new int[6];
    }
}