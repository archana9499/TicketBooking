import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminoptionComponent } from './adminoption.component';

describe('AdminoptionComponent', () => {
  let component: AdminoptionComponent;
  let fixture: ComponentFixture<AdminoptionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminoptionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminoptionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
