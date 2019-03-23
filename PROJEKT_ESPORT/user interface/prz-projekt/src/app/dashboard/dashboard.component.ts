import { Component, OnInit } from '@angular/core';
import { Team } from '../team';
import { TeamService } from '../team.service';
import { News} from '../news';
import { NewsServiceService } from '../news-service.service';

 
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: [ './dashboard.component.css' ]
})
export class DashboardComponent implements OnInit {

  newses: News[];
 
  constructor(private newsServiceService: NewsServiceService) { }
 
  ngOnInit() {
    this.getNews();
  }

  getNews(): void {
    this.newsServiceService.getMyNews()
    .subscribe(latestNewses => {this.newses = latestNewses; console.log(latestNewses)});
  }

}