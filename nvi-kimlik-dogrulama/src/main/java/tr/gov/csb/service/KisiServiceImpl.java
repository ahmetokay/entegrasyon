package tr.gov.csb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import tr.gov.csb.ws.KPSPublic;

@Component
public class KisiServiceImpl implements KisiService {

    private Logger LOGGER = LoggerFactory.getLogger(KisiServiceImpl.class);

    @Override
    public boolean dogrula(long tckn, String ad, String soyad, int dogumYil) {
        LOGGER.info("*** TCKN: " + tckn + ", AD: " + ad + ", SOYAD: " + soyad + ", YIL: " + dogumYil);

        return new KPSPublic().getKPSPublicSoap().tcKimlikNoDogrula(tckn, ad, soyad, dogumYil);
    }
}