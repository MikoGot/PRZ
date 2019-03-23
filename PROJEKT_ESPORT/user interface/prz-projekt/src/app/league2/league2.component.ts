import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TEAMS } from '../mock-teams';
import { TeamService } from '../team.service';

@Component({
  selector: 'app-league2',
  templateUrl: './league2.component.html',
  styleUrls: ['./league2.component.css']
})
export class League2Component implements OnInit {

  selectedTeam: Team;
  teams: Team[];

  constructor(private teamService: TeamService) { }

  ngOnInit() {
    this.getTeams(2);
  }

  
  onSelect(team: Team): void {
    this.selectedTeam = team;
  }

  getTeams(id: number): void {
    this.teamService.getTeamsLeagueTwo(id)
      .subscribe(teams => this.teams = teams);
  }

}
