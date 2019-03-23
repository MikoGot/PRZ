import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TEAMS } from '../mock-teams';
import { TeamService } from '../team.service';

@Component({
  selector: 'app-league1',
  templateUrl: './league1.component.html',
  styleUrls: ['./league1.component.css']
})
export class League1Component implements OnInit {

  selectedTeam: Team;
  teams: Team[];

  constructor(private teamService: TeamService) { }

  ngOnInit() {
    this.getTeams(1);
  }

  
  onSelect(team: Team): void {
    this.selectedTeam = team;
  }

  getTeams(id: number): void {
    this.teamService.getTeamsLeagueOne(id)
      .subscribe(teams => this.teams = teams);
  }

}
