import { Component, OnInit } from '@angular/core';
import{Router} from '@angular/router';


@Component({
  selector: 'app-useroption',
  templateUrl: './useroption.component.html',
  styleUrls: ['./useroption.component.css']
})
export class UseroptionComponent implements OnInit {

  constructor(private router:Router) { }

  goToPage(pageName:string):void{
    let k=pageName;
    this.router.navigate([`${pageName}`]);
  }

  ngOnInit(): void {
  }

}
