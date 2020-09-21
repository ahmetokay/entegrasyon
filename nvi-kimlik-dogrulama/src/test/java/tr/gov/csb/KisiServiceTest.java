package tr.gov.csb;

import org.junit.Assert;
import org.junit.Test;
import tr.gov.csb.ws.KPSPublic;

public class KisiServiceTest {

    private KPSPublic kpsPublic = new KPSPublic();

    @Test
    public void dogruBilgi() {
        Assert.assertTrue(kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(16228427192L, "ahmet", "okay", 1988));
    }

    @Test
    public void yanlisBilgi() {
        Assert.assertFalse(kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(16228427192L, "ahmet", "okay", 1987));
    }
}