package com.wk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Commodity {

    private int c_id;
    private String c_name;
    private String c_type;
    private int c_num;
    private int c_price;
}
