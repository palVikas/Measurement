import com.company.*;
import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vikaspal on 3/13/2015.
 */
public class LengthTest {
   @Test
    public void foot_is_equal_to_12_inches(){
       Length oneFeet = new Length(1.0,Unit.Foot);
       Length twelveInches = new Length(12.0,Unit.Inches);
       assertTrue(oneFeet.equals(twelveInches));
       assertTrue(twelveInches.equals(oneFeet));

   }
    @Test
    public void OneGallon_is_equal_to_threePointSevenEightLiters(){
        Length oneGallen = new Length(1.0,Unit.Gallen);
        Length threePointSevenLiters = new Length(3.78,Unit.Liters);
        assertTrue(oneGallen.equals(threePointSevenLiters));
        assertTrue(threePointSevenLiters.equals(oneGallen));
    }

    @Test
    public void convertGallonToLitearWillGiveThreePointSevenEightLiter(){
        Length twoFeet = new Length(2.0,Unit.Foot);
        Length _24_Inches = new Length(24.0,Unit.Inches);
        Length inches = twoFeet.convertToInches();
        assertTrue(twoFeet.equals(_24_Inches));


    }



}
