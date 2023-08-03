package solid.live.ocp;

public interface Resource {
    
    void markSlotFree(int resourceId);
    void markSlotBusy(int resourceId);
    int findFreeSlot();

}
