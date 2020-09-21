package tr.gov.csb;

import org.junit.Assert;
import org.junit.Test;
import tr.gov.csb.ws.KPSPublic;

import java.net.MalformedURLException;
import java.net.URL;

public class KisiServiceTest {

    @Test
    public void dogruBilgi() {
        try {
            KPSPublic kpsPublic = new KPSPublic(new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL"));

            Assert.assertTrue(kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(16228427192L, "ahmet", "okay", 1988));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void yanlisBilgi() {
        try {
            KPSPublic kpsPublic = new KPSPublic(new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL"));

            Assert.assertFalse(kpsPublic.getKPSPublicSoap().tcKimlikNoDogrula(16228427192L, "ahmet", "okay", 1987));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}