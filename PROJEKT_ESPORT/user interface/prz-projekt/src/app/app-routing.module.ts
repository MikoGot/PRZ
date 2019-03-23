import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { League1Component }      from './league1/league1.component';
import { League2Component }      from './league2/league2.component';
import { DashboardComponent }   from './dashboard/dashboard.component';
import { TeamFormComponent }   from './team-form/team-form.component';
import { SignInComponentComponent }   from './sign-in-component/sign-in-component.component';

const routes: Routes = [
  { path: 'league1', component: League1Component },
  { path: 'league2', component: League2Component },
  { path: 'dashboard', component: DashboardComponent },
  { path: 'add-data', component: TeamFormComponent },
  { path: 'login', component: SignInComponentComponent },
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
