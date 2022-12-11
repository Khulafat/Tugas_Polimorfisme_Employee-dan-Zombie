package Zombie;

/**
 *
 * @author Afad
 */
public class JumpingZombie extends Zombie{

    JumpingZombie(int health, int level) {
        super(health,level);
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = \n"+ super.getZombieInfo();
    }

    @Override
    public void destroyed() {
        health -= health * 10/100;
    }

    @Override
    public void heal() {
        if(level == 1){
            health *= 1.1;
        } else if(level == 2){
            health *= 1.3;
        } else if(level == 3) {
            health *= 1.4;
        }
    }  
}
