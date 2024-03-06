package springs_annotation_dto;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Bike {
	public void used() {
		System.out.println("my bike name is bullet 350");
		
	}

}
