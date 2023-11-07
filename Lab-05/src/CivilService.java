public class CivilService implements NationalService {
    int daysleft;
    public CivilService(){
        this.daysleft = 362;
    }

    @Override
    public int getDaysLeft() {
        return this.daysleft;
    }

    @Override
    public void work() {
        if (this.daysleft > 0) {
            daysleft--;
        }
    }
}
