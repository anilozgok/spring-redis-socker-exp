package com.example.springredisexp.entity;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bid {

    private Long bidId;

    private Long bidderId;

    private Long bidItemId;

    private Double bidPrice;

}
