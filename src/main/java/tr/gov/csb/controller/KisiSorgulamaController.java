package tr.gov.csb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.gov.csb.service.KisiService;

@RestController
@RequestMapping("nvi/v1")
public class KisiSorgulamaController {

    @Autowired
    private KisiService kisiService;

    @RequestMapping(value = "/dogrula", method = RequestMethod.GET)
    public ResponseEntity<Boolean> dogrula(@RequestParam("tckn") long tckn, @RequestParam("ad") String ad, @RequestParam("soyad") String soyad, @RequestParam("dogumYil") int dogumYil) {
        return new ResponseEntity<>(kisiService.dogrula(tckn, ad, soyad, dogumYil), HttpStatus.OK);
    }
}