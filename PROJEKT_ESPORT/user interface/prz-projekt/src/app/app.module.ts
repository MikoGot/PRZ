import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { League1Component } from './league1/league1.component';

import { FormsModule } from '@angular/forms';
import { TeamDetailComponent } from './team-detail/team-detail.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { League2Component } from './league2/league2.component'; 
import { HttpClientModule }    from '@angular/common/http';
import { TeamFormComponent } from './team-form/team-form.component';
import { PlayerFormComponent } from './player-form/player-form.component';
import { AddDataComponent } from './add-data/add-data.component';

import { SocialLoginModule, AuthServiceConfig } from "angularx-social-login";
import { FacebookLoginProvider} from "angularx-social-login";
import { SignInComponentComponent } from './sign-in-component/sign-in-component.component';


let config = new AuthServiceConfig([
  {
    id: FacebookLoginProvider.PROVIDER_ID,
    provider: new FacebookLoginProvider("526660457743375")
  }
]);
 
export function provideConfig() {
  return config;
}

@NgModule({
  declarations: [
    AppComponent,
    League1Component,
    TeamDetailComponent,
    DashboardComponent,
    League2Component,
    TeamFormComponent,
    PlayerFormComponent,
    AddDataComponent,
    SignInComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule, 
    SocialLoginModule
  ],
  providers: [
    {
      provide: AuthServiceConfig,
      useFactory: provideConfig
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
