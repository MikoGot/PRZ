import { Injectable } from '@angular/core';
import { Team } from './team';
import { TeamUpdateDto } from './teamDto';
import { TEAMS } from './mock-teams';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { AuthedUserService } from './authed-user.service';
import { SocialUser } from 'angularx-social-login';


@Injectable({
  providedIn: 'root'
})
export class TeamService {

  private user: SocialUser;

  constructor(
    private http: HttpClient,
    private authedUserService: AuthedUserService
    ) { }


  getTeamsMock(id: number): Observable<Team[]> {
    return of(TEAMS);
  }

  getTeamsLeagueOne(id: number): Observable<Team[]> {
    return this.http.get<Team[]>('http://localhost:2990/teams/list/1');
  }

  getTeamsLeagueTwo(id: number): Observable<Team[]> {
    return this.http.get<Team[]>('http://localhost:2990/teams/list/2');
  }

  createNewTeam (teamUpdateDto: TeamUpdateDto): Observable<TeamUpdateDto> {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json',
        'Accept': 'application/json'
      })
    };

    return this.http.post<TeamUpdateDto>('http://localhost:2990/add-team', teamUpdateDto);
  }

}
