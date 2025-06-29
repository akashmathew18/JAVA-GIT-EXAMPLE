public class ResourceHolder {
    private String resourceName;

    public ResourceHolder(String resourceName) {
        this.resourceName = resourceName;
        System.out.println(resourceName + " acquired.");
    }

    @Override
    protected void finalize() {
        System.out.println(resourceName + " is being garbage collected.");
    }

    public static void main(String[] args) {
        ResourceHolder holder = new ResourceHolder("DemoResource");
        holder = null;
        System.gc();
        System.out.println("End of main.");
    }
}