package com.example.demo.controller;

import com.example.demo.model.SinhVien;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping(
            value="/sinhvien",
            produces = {
                    "application/json",
                    "application/xml"
            }
    )

    public List<SinhVien> getSinhVien() {

        List<SinhVien> list =
                new ArrayList<>();

        list.add(
                new SinhVien(
                        "SV001",
                        "Nguyen Van A",
                        8.5
                )
        );

        list.add(
                new SinhVien(
                        "SV002",
                        "Tran Van B",
                        7.8
                )
        );

        list.add(
                new SinhVien(
                        "SV003",
                        "Le Thi C",
                        9.0
                )
        );

        return list;

    }

}
