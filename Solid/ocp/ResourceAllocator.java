package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        try {
            int resourceId = resource.findFreeSlot();
            resource.markSlotBusy(resourceId);
            return resourceId;

        } catch (Exception e) {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            int resourceId = INVALID_RESOURCE_ID;
        }
        return 0;
    }
        public void free(Resource resource, int resourceId) {
            try {
                resource.markSlotFree(resourceId);
            } 
            catch (Exception e) {
                // TODO: handle exception
                System.out.println("ERROR: attempted to free invalid resource");
            }
    }
}
