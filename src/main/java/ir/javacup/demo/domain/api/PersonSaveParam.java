package ir.javacup.demo.domain.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonSaveParam {

	private String firstName;
	private String lastName;
	private String nationalCode;

}
