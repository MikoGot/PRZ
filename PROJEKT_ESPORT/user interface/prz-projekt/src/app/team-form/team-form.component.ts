import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TeamService } from '../team.service';
import { TeamUpdateDto } from '../teamDto';

@Component({
  selector: 'app-team-form',
  templateUrl: './team-form.component.html',
  styleUrls: ['./team-form.component.css']
})
export class TeamFormComponent implements OnInit {

  constructor(private teamService: TeamService) { }

  ngOnInit() {
  }

  leagues = [1, 2];

  model: Team = {
    teamId: 3,
    name: 'new team',
    leagueNumber: 1
  };

  submitted = false;

  onSubmit() { 
    console.log('onSubmit');
    this.submitted = true; 

    const teamUpdateDto: TeamUpdateDto = {
      leagueId: this.model.leagueNumber,
      name: this.model.name,
      captainId: 1
    }

    this.teamService.createNewTeam(teamUpdateDto).subscribe(
      response => console.log(response),
      err => console.log(err)
    );

    this.model = {
      teamId: 0,
      name: ' ',
      leagueNumber: 1
    };
  }

  // getTeams(id: number): void {
  //   this.teamService.getTeamsById(id)
  //     .subscribe(heroes => this.teams = heroes);
  // }

}
