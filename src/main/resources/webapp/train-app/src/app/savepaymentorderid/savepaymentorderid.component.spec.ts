import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SavepaymentorderidComponent } from './savepaymentorderid.component';

describe('SavepaymentorderidComponent', () => {
  let component: SavepaymentorderidComponent;
  let fixture: ComponentFixture<SavepaymentorderidComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SavepaymentorderidComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SavepaymentorderidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
