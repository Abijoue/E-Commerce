package ma.commerce.domaine;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataBaseFileVo implements Serializable{
	private String fileName;
	private String fileType;
	private byte[] data;
}
