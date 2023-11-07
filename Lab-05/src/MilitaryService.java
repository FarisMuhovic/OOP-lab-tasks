public class MilitaryService implements NationalService {
    int daysleft;
    public MilitaryService(int daysleft){
        this.daysleft = daysleft;
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
