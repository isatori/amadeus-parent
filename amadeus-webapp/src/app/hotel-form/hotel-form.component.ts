import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';

import { HotelService } from '../provider';

@Component({
  selector: 'hotel-form',
  templateUrl: './hotel-form.component.html',
  styleUrls: ['./hotel-form.component.css'],
  providers: [HotelService]
})
export class HotelFormComponent implements OnInit {

  hotelList: Array<any>;

  constructor(private hotelService: HotelService) { }

  ngOnInit() {
  }

  onSubmit(value: any) {
  	console.log(value);

  	this.hotelService.getAll(value).subscribe(
      data => {
        this.hotelList = data;
      },
      error => console.log(error)
    );
  }

}
