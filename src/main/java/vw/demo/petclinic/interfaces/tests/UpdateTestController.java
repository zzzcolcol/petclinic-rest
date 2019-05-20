package vw.demo.petclinic.interfaces.tests;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/update")
@Slf4j
public class UpdateTestController {
    @GetMapping("")
    public ResponseEntity updateTest() {
        return ResponseEntity.ok("동물병원 서비스 코드 파이프라인 업데이트 테슷흐.");
    }
}
