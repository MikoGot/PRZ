import { Injectable } from '@angular/core';
import { SocialUser } from 'angularx-social-login';

import { Observable, of } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class AuthedUserService {

  user: SocialUser;

  constructor() { }

  getUser(): Observable<SocialUser> {
    return of(this.user);
  }
  // getUser(): SocialUser {
  //   return this.user;
  // }

  setUser(aUser : SocialUser){
    this.user = aUser;
  }


}
