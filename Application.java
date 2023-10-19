package com.xworlz.softwarehub.application;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Application {
        private int appId;
        private String appName;
        private int sizeInMb;
        private String companyName;
        private double version;
        private String releasedDate;
        private String appType;
}
