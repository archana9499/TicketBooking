import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SavepaymentComponent } from './savepayment.component';

describe('SavepaymentComponent', () => {
  let component: SavepaymentComponent;
  let fixture: ComponentFixture<SavepaymentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SavepaymentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SavepaymentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
