import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetbookingdetailsComponent } from './getbookingdetails.component';

describe('GetbookingdetailsComponent', () => {
  let component: GetbookingdetailsComponent;
  let fixture: ComponentFixture<GetbookingdetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetbookingdetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetbookingdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
