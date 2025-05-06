package uz.nanotechsolutions.clinic.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ambulatory-card")
@RequiredArgsConstructor
@Tag(name = "Ambulatory card", description = "Ambulatory card")
public class AmbulatoryCardController {

    @PreAuthorize("hasAuthority('receptionist:create')")
    @GetMapping()
    public ResponseEntity<?> getMyPatients(@RequestParam Integer doctorId) {
        return null;
    }
}
