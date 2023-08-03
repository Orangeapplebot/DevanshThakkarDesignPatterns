package solid.live.ocp;

public class SpaceSlot implements ResourceInterface {

    @Override
    public void markSlotFree(int resourceId) {}

    @Override
    public void markSlotBusy(int resourceId) {}

    @Override
    public int findFreeSlot() { return 0;}
    
}
