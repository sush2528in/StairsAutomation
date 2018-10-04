import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StairsTests {
    Stairs stairs;
    @BeforeClass
    public void setup() {
        stairs = new Stairs();
    }
    @Test
    public void test1_With0Stairs(){
        Assert.assertEquals(stairs.countWays(-1),0,"Failed for stair count 0");
    }

    @Test
    public void test2_With4Stairs(){
        Assert.assertEquals(stairs.countWays(4),5,"Failed for stair count 4");
    }

    /**
     * Test that if any negative stairs provided then code should return 0 ways.
     */
    @Test
    public void test3_WithNegativeStairs(){
        Assert.assertEquals(stairs.countWays(-4),0,"Failed for stair count in negative");
    }

    /**
     * Test that Exception has been handled properly
     */
    @Test
    public void test4_WithoutPassingAnyStairs(){
        Assert.assertEquals(stairs.countWays(Integer.parseInt("")),0,"Failed for stair count in passing as empty");
    }

    /**
     * Test that Null Pointer Exception has been handled properly
     */
    @Test
    public void test5_NullAsStairs(){
        Integer i= null;
        Assert.assertEquals(stairs.countWays(i),0,"Failed for stair count passing as null");
    }
    @Test
    public void test6_WithNonIntStairs(){
        Assert.assertEquals(stairs.countWays(Integer.parseInt("test")),0,"Failed for stair count passed as non int value");
    }

    /**
     * Test the functionality be passing big value
     */
    @Test
    public void test7_With50Stairs(){
        Assert.assertEquals(stairs.countWays(99),1109825406,"Failed for stair count 99");
    }
}