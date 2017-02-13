package Engine;

/**
 * Created by Денис Рабочая on 13.02.2017. This class of RunServer.
 */
public class Vector3 {
    float x;
    float y;
    float z;


    public Vector3 (float x, float y, float z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector3 (float x, float y)
    {
        this.x=x;
        this.y=y;
        this.z=0;
    }

    public Vector3 Summ(Vector3 a, Vector3 b)
    {
        return new Vector3(a.x+b.x, a.y+b.y, a.z+b.z);
    }

    public static Vector3 zero = new Vector3(0, 0,0);
    public static Vector3 up = new Vector3(0, 1,0);
    public static Vector3 down = new Vector3(0, -1, 0);
    public static Vector3 right = new Vector3(1,0, 0);
    public static Vector3 left = new Vector3(-1,0, 0);
    public static Vector3 forward = new Vector3(0,0,1);
    public static Vector3 backward = new Vector3(0,0,-1);
    public float getMagnitude() {
        return x * x + y * y + z * z;
    }
}
