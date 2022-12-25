package HW_2;

import java.util.ArrayList;

public class WardrobeSpace {

    enum CabinetDoor {
        Open, Close;
    }

    protected CabinetDoor openOrClosed;

    protected ArrayList<String> clothes;

    public WardrobeSpace() {
        this.clothes = new ArrayList<>();
        this.openOrClosed = CabinetDoor.Close;
    }

    public CabinetDoor getOpenOrClosed() {
        return openOrClosed;
    }

    protected void setOpenOrClosed() {
        if (this.openOrClosed == CabinetDoor.Close) {
            this.openOrClosed = CabinetDoor.Open;
            return;
        } else {
            this.openOrClosed = CabinetDoor.Close;
            return;
        }
    }
}