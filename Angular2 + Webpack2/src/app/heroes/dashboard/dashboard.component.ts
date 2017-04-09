import { Component, OnInit } from '@angular/core';

import { Hero }        from '../shared/hero';
import { HeroService } from '../shared/hero.service';
import {count} from "rxjs/operator/count";

@Component({
  selector: 'my-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: [ './dashboard.component.less' ]
})
export class DashboardComponent implements OnInit {
  heroes: Hero[] = [];
  count: number = 0;

  constructor(private heroService: HeroService) { }

  ngOnInit(): void {
    console.log(`DashboardComponent-init = ${++this.count}`);
    this.heroService.getHeroes()
      .then(heroes => this.heroes = heroes.slice(1, 5));
  }
}
