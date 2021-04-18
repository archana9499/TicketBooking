import { Component, OnInit } from '@angular/core';
import{Router} from '@angular/router';

@Component({
  selector: 'app-adminoption',
  templateUrl: './adminoption.component.html',
  styleUrls: ['./adminoption.component.css']
})
export class AdminoptionComponent implements OnInit {

  constructor(private router:Router) { }

  goToPage(pageName:string):void{
    let k=pageName;
    this.router.navigate([`${pageName}`]);
  }
  ngOnInit(): void {
  }

}
