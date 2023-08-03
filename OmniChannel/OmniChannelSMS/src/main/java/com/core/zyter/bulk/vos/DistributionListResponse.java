package com.core.zyter.bulk.vos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DistributionListResponse {

	String firstName;
	String lastName;
	String dob;
	String phoneNumber;
}
