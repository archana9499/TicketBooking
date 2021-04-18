import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetsearchdetailComponent } from './getsearchdetail.component';

describe('GetsearchdetailComponent', () => {
  let component: GetsearchdetailComponent;
  let fixture: ComponentFixture<GetsearchdetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetsearchdetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetsearchdetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
