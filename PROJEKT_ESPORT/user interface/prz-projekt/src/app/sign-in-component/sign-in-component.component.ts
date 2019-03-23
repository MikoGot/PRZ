import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs/operators';

import { AuthService } from 'angularx-social-login';
import { SocialUser } from 'angularx-social-login';
import { FacebookLoginProvider } from 'angularx-social-login';

import { AuthedUserService } from '../authed-user.service';


@Component({
  selector: 'app-sign-in-component',
  templateUrl: './sign-in-component.component.html',
  styleUrls: ['./sign-in-component.component.css']
})
export class SignInComponentComponent implements OnInit {

  user: SocialUser;

  constructor(private authService: AuthService, private authedUserService: AuthedUserService) { }

  ngOnInit() {
    this.authService.authState.subscribe((user) => {
      this.user = user;
    });
  }

  signInWithFB(): void {
    console.log('signing in')
    this.authService.signIn(FacebookLoginProvider.PROVIDER_ID);



    // localStorage.setItem('token', this.user.authToken);
    // this.authedUserService.setUser(this.user);
  }

  signOut(): void {
    this.authService.signOut();
    window.location.reload();
  }

}
