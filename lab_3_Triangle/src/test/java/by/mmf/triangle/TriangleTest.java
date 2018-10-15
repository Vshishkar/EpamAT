package by.mmf.triangle;

import by.mmf.triangle.entity.TriangleService;
import org.junit.Test;
import org.testng.Assert;

public class TriangleTest {

    private TriangleService triangleService = new TriangleService();

    @Test
    public void isTriangle_OneSideIsNegative_false(){
        Assert.assertFalse(triangleService.isTriangle(-5,1,2));
    }

    @Test
    public void isTriangle_TwoSidesAreNegative_false(){
        Assert.assertFalse(triangleService.isTriangle(-5,-1,2));
    }

    @Test
    public void isTriangle_ThreeSidesAreNegative_false(){
        Assert.assertFalse(triangleService.isTriangle(-5,-1,-2));
    }


    @Test
    public void isTriangle_SumTwoEqualsSidesLessThanThirdAndThirdMoreThanSecond_false(){
        Assert.assertFalse(triangleService.isTriangle(5,5,12));
    }

    @Test
    public void isTriangle_SumTwoEqualsSidesMoreThanThird_true(){
        Assert.assertTrue(triangleService.isTriangle(5,5,4));
    }

    @Test
    public void isTriangle_OneSideIsZero_false(){
        Assert.assertFalse(triangleService.isTriangle(5,1,0));
    }

    @Test
    public void isTriangle_TwoSidesAreZero_false(){
        Assert.assertFalse(triangleService.isTriangle(0,1,0));
    }

    @Test
    public void isTriangle_AllSidesAreZero_false(){
        Assert.assertFalse(triangleService.isTriangle(0,0,0));
    }

    @Test
    public void isTriangle_SumOfTwoEqualsThirds_false(){
        Assert.assertFalse(triangleService.isTriangle(5,1,4));
    }

    @Test
    public void isTriangle_OkTest_true(){
        Assert.assertTrue(triangleService.isTriangle(5,2,4));
    }


}
