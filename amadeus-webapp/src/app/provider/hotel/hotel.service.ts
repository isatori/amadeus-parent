import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable()
export class HotelService {

  constructor(private http: HttpClient) {}

  getAll(value: any): Observable<any> {

	// just a mock object return from our rest api
	//  var resp = '[
	//   {
	//     "property_code": "LQYVR759",
	//     "property_name": "La Quinta Inn Vancouver Airport",
	//     "address": {
	//       "line1": "18640 Alexandra Road",
	//       "city": "Richmond",
	//       "region": "BC",
	//       "postal_code": "Y6X1C4",
	//       "country": "CA"
	//     },
	//     "min_daily_rate": {
	//       "amount": "120.59"
	//     },
	//     "contacts": [
	//       {
	//         "type": "PHONE",
	//         "detail": "1-604-276-2711"
	//       },
	//       {
	//         "type": "FAX",
	//         "detail": "1-604-276-2733"
	//       },
	//       {
	//         "type": "EMAIL",
	//         "detail": "lq0759gm@laquinta.com"
	//       },
	//       {
	//         "type": "URL",
	//         "detail": "http.//759.lq.com"
	//       }
	//     ]
	//   }
	// ]';
  	//return JSON.parse(resp);

	return this.http.get('http://localhost:8080/hotelsearch'
		+ '?airport=' + value.location 
		+ '&check_in=' + value.check_in 
		+ '&check_out=' + value.check_out
		);

  }

}
