package abstractfactory;

import abstractfactory.aws.AwsResourceFactory;
import abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private final ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance instanceAws = aws.createServer(Instance.Capacity.micro, 20480);
        instanceAws.start();
        instanceAws.stop();

        Client gcp = new Client(new GoogleResourceFactory());
        Instance instanceGcp = gcp.createServer(Instance.Capacity.large, 20480);
        instanceGcp.start();
        instanceGcp.stop();
    }
}
