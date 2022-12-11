package Zombie;

/**
 *
 * @author Afad
 */
public class Plant {
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie) {
            ((WalkingZombie) d).destroyed();
        } else if(d instanceof JumpingZombie) {
            ((JumpingZombie) d).destroyed();
        } else if(d instanceof Barrier) {
            ((Barrier)d).destroyed();
        }
    }
}
